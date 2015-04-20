/**
 *
 * @author ddrank
 */

public class DiceController {

    private final DiceModel model;
    private final DiceGUI view;
    private int dice;

    public DiceController(DiceModel model, DiceGUI view) {
        this.model = model;
        this.view = view;
    }

    public static void main(String[] args) {
        DiceModel model = new DiceModel();
        DiceGUI view = new DiceGUI();
        DiceController controller = new DiceController(model, view);
        view.registerController(controller);
    }

    
    public void throwDice(int no) {
        for (int i = 1; i <= no; i++) {
            dice = model.diceCount();
            view.setResult(model.thrown());
        }
        view.setTotal(dice);
        view.setDicePic(dice);
    }

}
