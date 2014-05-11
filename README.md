TwistedEquationsTutorial
========================

This package implements several of the TwistedEquations tutorials.
See YouTube TwistedEquations.  Hopefully I'm not stepping on
anyone's toes but have found them to be really useful learning tools.

Fri May  9 19:39:15 PDT 2014
This implements tutorials 2 through 4.
It implements an app with a single activity.
The activity has a text view and a button.
Clicking the "Press Me" button toggles the 
text view between "Hello Android" and 
"Hello World."

It also has the various 'on...' action
methods and each has a toast item that 
announces when the method is entered.

Sat May 10 11:43:29 PDT 2014
lesson 5:
   1) moved the "Press Me" on click listener from the 
      MainAction.onCreate method to the PressMeButtonClick method.
      This involved adding "android:onClick="PressMeButtonClick"
      to the button's declaration in main_activity.xml.
   2) Changed layout button and text from center_horizontal to 
      center.  Also changed from Relative layout I initially used
      to Linear Vertical layout.
   3) add two new res/layout directories: layout-land and layout-port
      Copy the mainActivity.xml file into each of these folders and 
      change the one in the land (landscape) directory to use 
      LinearLayout horizontal.  When you change the device orientation
      now, the system uses the layout-land xml for landscape mode
      and layout-port for portrait mode.  Watch the 'Toast' messages
      when you do this and you will see that the action is totally 
      rebuilt.
   4) added code to trace the activity state.  Look for tag:MainActivity:
      There are also 'Toast' messages to show this same data.

Sat May 10 14:56:58 PDT 2014
tutorial 6:
    Added a second activity with a button, three edit text items and
    three text views.  Second activity will set the values in the
    text views to the values in the associated edit text views when
    the user presses the button.

Sat May 10 15:51:48 PDT 2014
    Added code to PressMe button to launch the SecondActivity and
    got an exception on launch.  Got a message saying
        E/AndroidRuntime(31113): Caused by:
        android.content.ActivityNotFoundException: Unable to find
        explicit activity class
        {com.te.tutorial/com.te.tutorial.SecondActivity};
        have you declared this activity in your AndroidManifest.xml?
    Had to add code to AndriodManifest describing the SecondActivity.
    Changed code in the PressMe button to send the contents of the
    MainActivity text view via the intent to the SecondActivity when
    it's started and put it in that activity's textName window.


