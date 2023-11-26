package ru.stqa.pft.addressbook.model;

import java.util.Objects;



public final class GroupData {
    private final String id;
    public final String name;
    public final String header;

    public String getId() {
        return id;
    }

    public final String footer;

    public GroupData(String name, String header, String footer) {
        this.id = null;
        this.name = name;
        this.header = header;
        this.footer = footer;
    }

    public GroupData(String id,String name, String header, String footer) {
        this.id = id;
        this.name = name;
        this.header = header;
        this.footer = footer;
    }

    public String name() {
        return name;
    }

    public String header() {
        return header;
    }

    public String footer() {
        return footer;
    }

    @Override
    public String toString() {
        return "GroupData{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GroupData groupData = (GroupData) o;
        return id.equals(groupData.id) && name.equals(groupData.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
