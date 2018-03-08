/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasaxparsertodom;

import java.util.ArrayList;
/**
 *
 * @author rjy7wb
 */
public class NodeOfParent {
    private final ArrayList<NodeOfChild> NodeOfChild;
    public NodeOfParent() {
        NodeOfChild = new ArrayList<>();
    }
    public ArrayList<NodeOfChild> getChildNodes() {
        return this.NodeOfChild;
    }
    public void addChildNode(NodeOfChild childNode) {
        NodeOfChild.add(childNode);
    }
}
