# CMPE 172 - Lab #2 Notes

##Spring MVC Project - Serving Web Content with Spring MVC

![image1](./images/Screenshot1.png)
![image2](./images/Screenshot2.png)
![image3](./images/Screenshot3.png)

##Spring Lombok

###- FieldLevelGetterSetterDemo.java
####a.

![image4](./images/Screenshot4.png)

+Annotation is @Setter And @Getter <br/>

+Fields are applied for these Lombok such as userName and userAge. Otherwise, userId is not applied.

####b. Lambok Anotation for this class: 

![image5](./images/Screenshot5.png)

+As the picture, the fields userAge (@Getter) and userName (@Getter and @Setter) have annotation. So the method will automatically generate and see the output in terminal <br/>
 (public java.lang.String com.example.springlombok.FieldLevelGetterSetterDemo.getUserName() <br/>
  public int com.example.springlombok.FieldLevelGetterSetterDemo.getUserAge() <br/>
  public void com.example.springlombok.FieldLevelGetterSetterDemo.setUserName(java.lang.String)).
  
+Besides, the field userId doesn’t have annotation. Therefore, output won’t generate in terminal 

###ValAndVarUserDemo.java
####a.

![image6](./images/Screenshot6.png)

+Annotation is local variable <br/>

+Local variable are applied for these Lombok such as valCheck() and varCheck().

####b.

![image7](./images/Screenshot7.png)

+In valCheck() method, constant userName is declared by val that it attempt to assign another value, but it get error.<br/>
+In varCheck() method, constant money is declared by var that it can assign another value without error.

###GetterSetterUserDemo.java
####a.
![image8](./images/Screenshot8.png)

+Anotation is @Getter and Setter <br/>

+These annotation are declared at top level class. So all the fields will be applied for such as userId, userName, and userAge

####b.
![image9](./images/Screenshot9.png)

+As the result, the fields userId, userAge, and userName have getter and setter method. So they will automatically generate and see the output in terminal. (public java.lang.String com.example.springlombok.GetterSetterUserDemo.getUserName()
  public int com.example.springlombok.GetterSetterUserDemo.getUserId()
  public int com.example.springlombok.GetterSetterUserDemo.getUserAge()
  public void com.example.springlombok.GetterSetterUserDemo.setUserId(int)
  public void com.example.springlombok.GetterSetterUserDemo.setUserName(java.lang.String)
  public void com.example.springlombok.GetterSetterUserDemo.setUserAge(int))

###ConstructorUserDemo.java
####a.

![image10](./images/Screenshot10.png)

+Annotation is @AllArgsConstructor <br/>

+The constructor is created with all parameters which the fields is declared such as userId, userName, and userAge

####b.

![image11](./images/Screenshot11.png)

+In that case, they will be tested with org.junit libs to assert a constructor which exist enough parameters, or decompile file .class to check. <br/>
+As the picture, the constructor ConstructorUserDemo(final int userId, final String userName, final int userAge) contain all the fields which become all the parameters

###DataUserDemo.java
####a.

![image12](./images/Screenshot12.png)

+Annotation is @Data

+Combining all feature including @Getter, @Setter, @ToString, @EqualsAndHashCode, @NoArgsConstructor, and @RequiredArgsConstructor

####b.

![image13](./images/Screenshot13.png)
![image14](./images/Screenshot14.png)

+To verify output, it will be decompiled. And check all feature as the pictures

###NonNullUserDemo.java
####a.

![image15](./images/Screenshot15.png)

+Annotation is @NonNull

+They used for check parameter and throw exception if it is null.

+The variable applied in the case is userName

####b.

![image16](./images/Screenshot16.png)

+As the result, userName is declared with @NotNull. But in this case, it == null and throw java.lang.NullPointerException: userName is marked non-null but is null
