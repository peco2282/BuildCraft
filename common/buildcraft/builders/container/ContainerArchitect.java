package buildcraft.builders.container;

import buildcraft.builders.tile.TileArchitect_Neptune;
import buildcraft.core.lib.gui.slots.SlotBase;
import buildcraft.core.lib.gui.slots.SlotOutput;
import buildcraft.lib.gui.ContainerBCTile;
import net.minecraft.entity.player.EntityPlayer;

public class ContainerArchitect extends ContainerBCTile<TileArchitect_Neptune> {
    private static final int PLAYER_INV_START_X = 88;
    private static final int PLAYER_INV_START_Y = 84;

    public ContainerArchitect(EntityPlayer player, TileArchitect_Neptune tile) {
        super(player, tile);
        addFullPlayerInventory(PLAYER_INV_START_X, PLAYER_INV_START_Y);


        addSlotToContainer(new SlotBase(tile.invBptIn, 0, 135, 35));
        addSlotToContainer(new SlotOutput(tile.invBptOut, 0, 194, 35));
    }

    @Override
    public boolean canInteractWith(EntityPlayer player) {
        return true;
    }
}
