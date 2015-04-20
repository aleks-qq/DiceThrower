# DiceThrower
My Dice rolling program I originally made as a Swing framework exercise
> - You roll one dice.
> - You can enter how many times you wish to roll the dice
> - The amount of rolled dices is displayed as a Jlabels
> - The result of the rolled dice is also displayed as a Jlabels 
> - The result is also displayed as a picture of the corresponding dice

----------
# How it works
The program runs around the Controller, GUI and Model class.
#### Controller
Where the main is located. Controller is handling everything eg. the throwing of dice
#### GUI
The view, where the updating of graphics happens. 
> - Registering the Controller
> - Initializing graphic components
> - Setting Jlabel results
> - Updating the dice picture

#### Model
Model of the dice. Keeps count of number of rolls and returns the value between 1-6 to the view.

#### Other stuff
I've also added a custom object: **NumericTextField** which is a subclass of the JTextField-class.
The JTextField wasn't good enough for me, since it doesn't handle numbers all that well, which is quite fundamental in this program.
