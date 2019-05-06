package com.smultron.treescript.Example.branches;

import com.smultron.treescript.BranchTask;
import com.smultron.treescript.Example.leafs.ChopTree;
import com.smultron.treescript.Example.leafs.DropInventory;
import com.smultron.treescript.TreeTask;
import org.rspeer.runetek.api.component.tab.Inventory;
import org.rspeer.ui.Log;

public class CheckInventory extends BranchTask
{
    @Override public TreeTask failureTask() {
	return new ChopTree();
    }

    @Override public TreeTask successTask() {
	return new DropInventory();
    }

    @Override public boolean validate() {
	Log.info("Checking inventory...");
	return Inventory.isFull();
    }
}
