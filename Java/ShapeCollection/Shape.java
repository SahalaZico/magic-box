//just my folder you can hapus "package com.shape" ya
package com.shape;

abstract class Shape {
    private String name;

    protected String getName() {
        return name;
    }

    protected void setName(String newName) {
        name = newName;
    }
    
    protected abstract double getCircumference();
}
