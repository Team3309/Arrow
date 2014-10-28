


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
  
  
  //Now, here are all the button methods, they all return a boolean that returns true if button is pressed (obviously)
  public boolean getA() {
    return Controller.getRawButton(XboxControllerMap.BUTTON_A);
  } 
  
  public boolean getB() {
    return Controller.getRawButton(XboxControllerMap.BUTTON_B);
  } 
  
  public boolean getX() {
    return Controller.getRawButton(XboxControllerMap.BUTTON_X);
  } 
  
  public boolean getY() {
    return Controller.getRawButton(XboxControllerMap.BUTTON_Y);
  } 
  
  public boolean getDpadUp() {
    return Controller.getRawButton(XboxControllerMap.BUTTON_DPAD_UP);
  } 
  
  public boolean getDpadDown() {
    return Controller.getRawButton(XboxControllerMap.BUTTON_DPAD_DOWN);
  } 
  
  public boolean getDpadLeft() {
    return Controller.getRawButton(XboxControllerMap.BUTTON_DPAD_LEFT);
  } 
  
  public boolean getDpadRight() {
    return Controller.getRawButton(XboxControllerMap.BUTTON_DPAD_RIGHT);
  } 
  
  public boolean getBack() {
    return Controller.getRawButton(XboxControllerMap.BUTTON_BACK);
  }
  
  public boolean getStart() {
    return Controller.getRawButton(XboxControllerMap.BUTTON_START);
  } 
  
  public boolean getLeftStickButton() {
    return Controller.getRawButton(XboxControllerMap.BUTTON_LEFT_STICK);
  }
  
  public boolean getRightStickButton() {
    return Controller.getRawButton(XboxControllerMap.BUTTON_RIGHT_STICK);
  } 
  
  public boolean getLB() {
    return Controller.getRawButton(XboxControllerMap.BUTTON_LB);
  } 
  
  public boolean getRB() {
    return Controller.getRawButton(XboxControllerMap.BUTTON_RB);
  } 
  
  public boolean getHome() {
    return Controller.getRawButton(XboxControllerMap.BUTTON_HOME);
  }
  
  
}
  
