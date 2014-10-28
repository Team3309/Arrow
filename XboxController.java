


public class XboxController extends GenericHID{

  //main instance joystick being called throughout class 
  Joystick Controller;
  
  /**
    Summary of methods used:
     float axis = Controller.getRawAxis(axisNumber); //see table below for axis numbers
     boolean button = Controller.getRawButton(buttonNumber);
        Constants define these values in XboxControllerMap.java, so replace "buttonNumber" with "XboxControllerMap.BUTTON_A"
  **/
  //info for usage of xbox remotes found at - http://www.chiefdelphi.com/forums/showthread.php?t=83597
  //Constructor, takes number and makes xbox remote that number joystick that is set by driver station
  public XboxController(int joystickNum) {
    Controller = new Joystick(joystickNum);
  }
  
  
