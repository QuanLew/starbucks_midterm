# CMPE 172 - Lab #4 Notes

### Start a Spring Initializr Project in IntelliJ

#### Screenshots and Discussion confirming a working Spring Security project.

+Before applying security to a web application, we will have a unsecurity web that you can see homepage view from controller.
![image8](./images/image8.png)<br/>

Besides, we can not click "here" hypertext as above images. If you try to login, you will transfer to login page view. <br/>
![image9](./images/image9.png)<br/>

+After applying security, we will see hello page view after logining successfully.
![image9](./images/image9.png)<br/>
![image10](./images/image10.png)<br/>

### Spring Gumball (Version 2)

#### Screenshots of your deployment of Spring Gumball (Version 2) to Docker Host:

+Deployment Details (at least 4 Containers)<br/>
+Show output via Docker PS<br/>
+NOTE: You will need to use a Load Balancer and Docker Compose.<br/>
Use in Class Demos for details on how to do this.<br/>
![image1](./images/image1.png)<br/>

#### Screenshots of Gumball App (Version 2) Running on Docker Host with your observations and answers to the following question:

+Do you see any errors that were observed in Spring Gumball (Version 1)?<br/>
![image2](./images/image2.png)
Yes, I do.<br/>
+Why or Why Not? Explain the technical details to support your observation.<br/>
This version 1 need to remove HTTP session or build a HMAC HASH version. Because the hidden value of state can't trust (store at the server side) when you come back to the browser. Therefore, we will remove the HTTP session and build a HMAC HASH by hashing the string including the timestamp, state, and keyhash. The reason we need the timestamp is to make sure the hash string won't be too old (expire). After that, this string will valid when you come back to browser, check the next day as well.

#### Screenshots of Spring Gumball Replay Attack (Before & After)

+Using the initial version of Spring Gumball v2.0, demonstrate a Replay Attack<br/>
![image3](./images/image3.png)
+Using your modified version of Spring Gumball v2.0, demonstrate how a Replay Attack is thwarted<br/>
![image4](./images/image4.png)
![image5](./images/image5.png)
![image6](./images/image6.png)
![image7](./images/image7.png)
