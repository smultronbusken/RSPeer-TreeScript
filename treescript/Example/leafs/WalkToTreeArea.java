package com.smultron.treescript.Example.leafs;

import com.smultron.treescript.LeafTask;
import org.rspeer.runetek.api.movement.Movement;
import org.rspeer.runetek.api.movement.position.Area;
import org.rspeer.runetek.api.movement.position.Position;
import org.rspeer.ui.Log;

public class WalkToTreeArea extends LeafTask
{

    public final Area TREE_AREA = Area.rectangular(3198, 3245, 3205, 3238);

    @Override public int execute() {
	Log.info("Walking to trees...");
	Movement.walkTo(TREE_AREA.getCenter());
        return 300;
    }
}
