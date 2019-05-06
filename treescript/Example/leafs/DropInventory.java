package com.smultron.treescript.Example.leafs;

import com.smultron.treescript.LeafTask;
import org.rspeer.runetek.adapter.component.Item;
import org.rspeer.runetek.api.commons.Time;
import org.rspeer.runetek.api.component.tab.Inventory;
import org.rspeer.ui.Log;

public class DropInventory extends LeafTask
{

    @Override public int execute() {
	Log.info("Dropping items");
	for(Item log : Inventory.getItems(item -> item.getName().equals("Logs"))){
	    log.interact("Drop");
	    Time.sleep(300);
	}
        return 0;
    }
}
