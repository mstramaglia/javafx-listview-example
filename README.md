# JavaFX ListView Example

A simple example of a JavaFX (SceneBuilder/FXML) application which presents data on the page using a ListView control.

The ListView is connected to an ObservableList, which uses the "Observer Pattern" to publish changes to the ObservableList to the GUI ListView.

This means as you add items to the ObservableList object, the JavaFX ListView automatically updates and displays the new items.