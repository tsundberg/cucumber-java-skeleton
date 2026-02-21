package skeleton;

import io.cucumber.java.en.Given;

public class Stepdefs {
    @Given("I have {int} cukes in my belly")
    public void i_have_cukes_in_my_belly(int cukes) {
        Belly belly = new Belly();
        belly.eat(cukes);
    }
}
