????   4 @  +main/java/PageEvents/AssertScreenshotEvents  test/java/BaseTest <init> ()V Code
  	   LineNumberTable LocalVariableTable this -Lmain/java/PageEvents/AssertScreenshotEvents; assertAndScreenshot 
Exceptions  java/lang/InterruptedException  java/io/IOException  main/java/Utils/ElementFetch
  		     logger )Lcom/aventstack/extentreports/ExtentTest;  Asserting a product
     'com/aventstack/extentreports/ExtentTest ! " info =(Ljava/lang/String;)Lcom/aventstack/extentreports/ExtentTest; $ &Printed Dress - Color : Blue, Size : S & XPATH ( =//*[@id="order-detail-content"]/table/tbody/tr[1]/td[2]/label
  * + , getWebElement F(Ljava/lang/String;Ljava/lang/String;)Lorg/openqa/selenium/WebElement; . 0 / org/openqa/selenium/WebElement 1 2 getText ()Ljava/lang/String;
 4 6 5 org/testng/Assert 7 8 assertEquals '(Ljava/lang/String;Ljava/lang/String;)V elementFetch Lmain/java/Utils/ElementFetch; expectedProduct Ljava/lang/String; product 
SourceFile AssertScreenshotEvents.java !               /     *? ?    
                                  ?     (? Y? L? ? W#M+%'? )? - N-,? 3?    
              "  ' #    *    (        9 :    ; <  "  = <   >    ?