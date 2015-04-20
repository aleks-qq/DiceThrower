# DiceThrower
My Dice rolling program I originally made as a Swing framework exercise
> - You roll one dice.
> - You can enter how many times you wish to roll the dice.
> - The program shows you the amount of rolled dices.
> - The result of the rolled dice is displayed as normal text(Jlabels) and as a picture of the corresponding dice.

----------
# How it works
The program runs around the Controller, GUI and Model class.
#### Controller
Where the main is located. Controller is handling everything eg. the throwing of dice
#### GUI
The view, where the graphic happens
#### Model
Model of the dice. Keeps count of number of rolls and returns the value between 1-6 to the view
#### Other stuff
I've also added a custom object **NumericTextField** which is a subclass of the JTextField-class
