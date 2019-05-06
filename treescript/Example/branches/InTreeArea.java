package com.smultron.treescript.Example.branches;

import com.smultron.treescript.BranchTask;
import com.smultron.treescript.Example.leafs.WalkToTreeArea;
import com.smultron.treescript.TreeTask;
import org.rspeer.runetek.api.movement.position.Area;
import org.rspeer.runetek.api.movement.position.Position;
import org.rspeer.runetek.api.scene.Players;
import org.rspeer.ui.Log;

public class InTreeArea extends BranchTask
{
    public final Area TREE_AREA = Area.rectangular(3198, 3245, 3205, 3238);

    @Override public TreeTask failureTask() {
	return new WalkToTreeArea();
    }

    @Override public TreeTask successTask() {
	return new CheckInventory();
    }

    @Override public boolean validate() {
	Log.info("Are we in tree area?");
	return TREE_AREA.contains(Players.getLocal());
    }
}
