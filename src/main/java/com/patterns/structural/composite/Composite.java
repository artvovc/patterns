package com.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Artemie on 14.01.2017.
 */
public class Composite implements Component {
    @Override
    public void operation() {
        componentList.forEach(component -> component.operation());
    }
    private List<Component> componentList = new ArrayList<>();

    public void setComponent(Component component) {
        this.componentList.add(component);
    }
}
