# FoodMood
An app for food sociopaths

10/29/17 Individual Submissions

BEN:
UI Pattern: Navigation
  Provided navigation throughout the application through the use of buttons and actionlisteners.
OO Pattern: Factory
  Created FoodMoodFactory that works with an Entry interface to provide access to two different types of entries; Food and Mood.
  This will prove useful later in the development of the application. A test class demonstrating its capabilities has been provided.
  
JOE:
Object Oriented Pattern: The CHECKS Pattern Language of Information Integrity
- Added conditionals and other checks to the input UIs to make sure user input was valid and not harmful.

UI Pattern: Input prompt
 -Adjusted UI to improve user experience and understanding of what is needed from them. This will be further added on to in the coming sprints as we identify areas where we can improve upon it even more

ZACH:
UI Pattern: Settings
 - Created a user settings window class (SettingsView) showing a basic layout of different user settings. Only 2 are shown, but this can be expanded later.

OO Pattern: Iteration
 - Added a loop with if-statements in SettingsView to gather settings value from an array. Isn't that relevant now, but can be adjusted to fit later goals and other uses

VINCE:
OO Design Pattern - Structural: Composite
I implemented this pattern in the models of the different CRUD classes. You can see it especially in the Food and Mood classes where I integrated primitive and composite objects.

UI Pattern - Fill in the blanks
This sprint I began to implement some fill in the blanks functionality into the CRUDs. As the project moves along I will look for more opportunities to utilize this.