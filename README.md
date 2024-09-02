# 💕 Robot class

1. this class provides control over the mouse and the keyboard devices(handles the pop-ups during the execution and also executions)
2. Helps to upload files onto a page.

📌Methods under the robot class

⌨️Methods under the keyboard

1. KeyPress(): used to press any key on the keyboard robot.keyPress(KeyEvent.VK_DOWN)- press the down key
2. KeyRelease(): release the press key on the keyboard robot.keyPress(KeyEvent.VK_DOWN) 

🖱️Methods under the mouse

1. MousePress() : used to press the left button of the mouse
2. MouseRelease: used to release the press button of the mouse
3. MouseMove() used to send the mouse pointer to the x and y coordinate

🚫 Limitations

1. Mouse or keyboard event will only work on the current instance of the window
2. It is difficult to switch among different frames or windows
3. Mouse move depends on the resolution



Window handling in Selenium refers to the ability to manage multiple browser windows or tabs within a single test script. 

When interacting with web applications, it is common to encounter scenarios where new windows or tabs are opened, such as pop-ups, new pages, or modals. Selenium provides methods to handle these different windows, allowing you to switch between them and perform actions as needed.

### Key Methods for Window Handling

1. **`getWindowHandle()`**:
    - Returns the unique identifier (a string) of the current window.
2. **`getWindowHandles()`**:
    - Returns a set of unique identifiers for all open windows.
3. **`switchTo().window(windowHandle)`**:
    - Switches the focus to the specified window using its handle.
  



# 🖥️ScreenShot

1. helps you to identify when and where a test failed
2. Helps us to get the flow of the application
3. TakeScreenshot()



Cross browser testing refers to testing the application in multiple browser like chrome, Firefox so we can test our application effectively

😵‍💫why

1. elements are displayed differently in different browser
2. Browser compatibility
3. Compatibility with new web frameworks
4. Image orientation
