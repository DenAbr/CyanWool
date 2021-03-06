package net.CyanWool.api.entity.component;

import net.CyanWool.api.entity.EntityLivingBase;

/**
 * Имя над головой для EntityLivingBase.
 * 
 * @author DinDev
 *
 */
public class DisplayNameComponent extends SystemComponent {

    private String displayName;
    private String previousName;
    private boolean visibleName;

    public DisplayNameComponent(EntityLivingBase entity) {
        super(entity);
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getPreviousName() {
        return previousName;
    }

    public void setDisplayName(String displayName) {
        this.previousName = this.displayName;
        this.displayName = displayName;
    }

    public boolean hasDisplayName() {
        return getDisplayName() != null;
    }

    public boolean isRenderDisplayName() {
        return visibleName;
    }

    public void setRenderDisplayName(boolean flag) {
        this.visibleName = flag;
    }

    @Override
    public String getID() {
        return "displayName";
    }

    @Override
    public void update() {
        if (hasDisplayName()) {
            getEntity().getMetadata().setMetadata(2, getDisplayName());
        }
        getEntity().getMetadata().setMetadata(3, (byte) (visibleName ? 1 : 0));
    }

    @Override
    public boolean autoUpdate() {
        return true;
    }

}