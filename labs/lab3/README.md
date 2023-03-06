# CMPE 172 - Lab #3 Notes

## Part 1 -- Spring Gumball on Docker

### Screenshots of deployment to Docker via Docker Compose

![image1](./images/image1.png)
![image2](./images/image2.png)
![image3](./images/image3.png)
<br/>

- When you load the page multiple times what do you see on the Gumball Home Pages for Server Host/IP? <br/>
  I witness the change in Server Host. It switches between two services.
- Can you explain where that IP value comes from? <br/>
- It come from container id. We have 3 container id (server host) where ip create and generate ip 172.25.0.2, 172.25.0.3<br/>
- Now, try to add some quarters and purchase some gumballs. <br/>
  Pressed! <br/>
- Do you see the inventory depleting? Are there any errors?<br/>
  When inserting in localhost, the website crashes and returns code 500. <br/>

![image4](./images/image4.png) <br/>

If same action is made in localhost:52955 or 52960, it work normally.<br/>

- Review to code for your answer. No need to make any code changes to fix any issue<br/>
- Look at the Session State Feature of the HA Loadbalancer (using COOKIES_ENABLED)

- Is there a setting that can avoid the error? Why does it work (or Why not).<br/>
  Yes, there is. If it should be COOKIE_ENABLED: "true" in docker-compose.yaml, it will work. The service can be confused between 2 container ip.<br/>
  (java.lang.NullPointerException: null
  at com.example.springgumball.GumballMachineController.postAction(GumballMachineController.java:74) ~[classes!/:1.0])<br/>

### Screenshots of Gumball App Running with your observations and answers to the following questions (on HA Proxy Load Balancer)

![image5](./images/image5.png)
![image6](./images/image6.png)

- Ping the endpoints (curl get) from LB and also for each node behind LB on localhost.<br/>

  ![image11](./images/image11.png)

#### For Docker:<br/>

- curl localhost (local machine/laptop) to Docker's LB port (port 80)<br/>
  ![image10](./images/image10.png)
- on each container (bash shell), curl localhost on port 8080<br/>
  ![image8](./images/image8.png)
  ![image9](./images/image9.png)
- Expected results should be HTML content for Gumball home page with HTTP Status 200.<br/>
  ![image7](./images/image7.png)
  ##Part 2 (Revisit Later for Project) -- Spring Gumball on Google Cloud
