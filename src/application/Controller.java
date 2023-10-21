package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

public class Controller {
	@ FXML
	private Text    output;
	private long    num1  = 0;
	private long    num2  = 0;

	private boolean start = true;

	private String  operator = "";
	private Model   model = new Model ();

	@ FXML
	private void processNum (ActionEvent event) {
		if (start) {
			output.setText ("");
			start = false;
		}
		String value = ((Button)event.getSource ()).getText ();
		output.setText (output.getText () + value);
	}

	@ FXML
	private void processOperator (ActionEvent event) {
		String value = ((Button)event.getSource ()).getText ();
		if (!"=".equals (value)) {
			if (!operator.isEmpty ()) {
				return;
			}
			operator = value;
			num1 = Long.parseLong (output.getText ());
			output.setText ("");
		} else {
			if (operator.isEmpty ()) {
				return;
			}
			output.setText (String.valueOf (model.calculation (num1, Long.parseLong (output.getText ()), operator)));
			operator = "";
			start = true;
		}

	}

	public Text getOutput () {
		return output;
	}

	public void setOutput (Text output) {
		this.output = output;
	}

	public long getNum1 () {
		return num1;
	}

	public void setNum1 (long num1) {
		this.num1 = num1;
	}

	public long getNum2 () {
		return num2;
	}

	public void setNum2 (long num2) {
		this.num2 = num2;
	}

	public boolean isStart () {
		return start;
	}

	public void setStart (boolean start) {
		this.start = start;
	}

	public String getOperator () {
		return operator;
	}

	public void setOperator (String operator) {
		this.operator = operator;
	}

	public Model getModel () {
		return model;
	}

	public void setModel (Model model) {
		this.model = model;
	}

}
