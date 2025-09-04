package com.magasin;

import org.approvaltests.Approvals;
import org.approvaltests.combinations.CombinationApprovals;
import org.approvaltests.combinations.CombinationsHelper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MagasinTest {

    @Test
    public void updateQuality() {
        String[] names = new String[]{"Comté", "Pass VIP Concert", "Kryptonite", "Truc"};
        Integer[] sellIns = new Integer[]{-1,0,1,5,10,15};
        Integer[] qualities = new Integer[]{0, 25, 55};

        CombinationApprovals.verifyAllCombinations(
                this::doUpdateQuality,
                names,
                sellIns,
                qualities
        );
    }

    private String doUpdateQuality(String name, int sell_in, int quality) {
        Item[] items = new Item[] { new Item(name, sell_in, quality)};
        Magasin app = new Magasin(items);
        app.updateQuality();
        return app.items[0].toString();
    }

}
