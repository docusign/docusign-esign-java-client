

package com.docusign.esign.client;



/**
 * Pair class.
 */
public class Pair {
    private String name = "";
    private String value = "";

   /**
    * Pair constructor.
    *
    * @param name The pair name
    * @param value The pair value
    */
    public Pair (String name, String value) {
        setName(name);
        setValue(value);
    }

    private void setName(String name) {
        if (!isValidString(name)) {
            return;
        }

        this.name = name;
    }

    private void setValue(String value) {
        if (!isValidString(value)) {
            return;
        }

        this.value = value;
    }

   /**
    * getName method.
    *
    * @return String
    */
    public String getName() {
        return this.name;
    }

   /**
    * getValue method.
    *
    * @return String
    */
    public String getValue() {
        return this.value;
    }

    private boolean isValidString(String arg) {
        if (arg == null) {
            return false;
        }

        if (arg.trim().isEmpty()) {
            return false;
        }

        return true;
    }
}
