package AnnotationBased.Qualifier;

import org.springframework.stereotype.Component;

public class WhiteDog implements Dog {

    @Override
    public void shut() {
        System.out.println("White Dog shut");
    }
}
