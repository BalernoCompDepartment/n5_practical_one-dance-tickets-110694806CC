class Main {
  public static void main(String[] args) {
    // creating variables
    String groupName;
    int groupSize;
    String[] photo = new String[10];
    String[] name = new String[10];
    String[] price = new String[10];
    String output = "";
    String heading = "Table test";

    // get inputs from the Keyboard

    groupName = Keyboard.getText("please enter your group name");

    groupSize = Keyboard.getInt("How many people are in your group?");

    while (groupSize < 4 || groupSize > 10) {
      Screen.display("group size must be between 4 and 10", "incorrect entry");
      groupSize = Keyboard.getInt("How many people are in your group?");
    }

    for (int index = 0; index < groupSize; index++) {
      name[index] = Keyboard.getText("Please enter name of group member " + (index + 1));

      photo[index] = Keyboard.getText("does " + name[index] + " want a photo?" + " y/n");

      if (photo[index].equals("y")) {
        price[index] = "4.99";
      } else {
        price[index] = "3.00";
      }
    }

    // generate output
    output = "Group name: " + groupName + "\n" + "Number of people: " + groupSize + "\n" + "\n";
    for (int index = 0; index < groupSize; index++) {
      output = output + name[index] + "  £" + price[index] + " \n";
    }
    Screen.display(output, heading);

    System.exit(0);

  }

}