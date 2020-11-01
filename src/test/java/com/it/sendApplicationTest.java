package com.it;

import org.graphwalker.core.condition.ReachedVertex;
import org.graphwalker.core.generator.RandomPath;
import org.graphwalker.core.machine.ExecutionContext;
import org.graphwalker.core.model.Edge;
import org.graphwalker.java.annotation.GraphWalker;
import org.graphwalker.java.test.TestBuilder;
import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.nio.file.Paths;


@GraphWalker(start = "e_OpenAnsokanPage")
public class sendApplicationTest extends ExecutionContext implements com.it.sendApplication{
    public final static Path MODEL_PATH = Paths.get("com/it/sendApplication.graphml");


    @Override
    public void e_OpenAnsokanPage() {
        System.out.println("Running: e_OpenAnsokanPage");

    }
    @Override
    public void v_AnsokanPageOpened() {

    }

    @Override
    public void e_ChooseValidUtbildning() {

    }

    @Override
    public void v_UtbildningSelected() {

    }

    @Override
    public void e_ChooseGender() {

    }

    @Override
    public void v_GenderSelected() {

    }

    @Override
    public void e_FillUserDetails() {

    }

    @Override
    public void v_UserDetailsAdded() {

    }

    @Override
    public void e_ClickSkickaBttn() {

    }

    @Override
    public void v_ConfirmationMessageShown() {

    }

    @Test
    public void runFunctionTest() {
        new TestBuilder()

                .addContext(new sendApplicationTest().setNextElement(new Edge().setName("e_OpenAnsokanPage").build()),
                        MODEL_PATH,
                        new RandomPath(new ReachedVertex("v_ConfirmationMessageShown")))
                .execute();
    }
}
