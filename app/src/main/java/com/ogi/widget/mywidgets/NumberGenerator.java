package com.ogi.widget.mywidgets;

import java.util.Random;

 class NumberGenerator {
    static int generate() {
        Random random = new Random();
        return random.nextInt(100);
    }
}
