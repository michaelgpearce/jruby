/*
 * YieldNode.java - description
 * Created on 01.03.2002, 20:38:42
 * 
 * Copyright (C) 2001, 2002 Jan Arne Petersen
 * Copyright (C) 2004 Thomas E Enebo
 * Jan Arne Petersen <jpetersen@uni-bonn.de>
 * Thomas E Enebo <enebo@acm.org>
 *
 * JRuby - http://jruby.sourceforge.net
 * 
 * This file is part of JRuby
 * 
 * JRuby is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * JRuby is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with JRuby; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 * 
 */
package org.jruby.ast;

import org.ablaf.ast.INode;
import org.ablaf.ast.visitor.INodeVisitor;
import org.ablaf.common.ISourcePosition;
import org.jruby.ast.visitor.NodeVisitor;

/** Represents a yield statement.
 *
 * @author  jpetersen
 * @version $Revision$
 */
public class YieldNode extends AbstractNode {
    static final long serialVersionUID = -4136185449481135660L;

    private final INode argsNode;
    private final boolean checkState;

    public YieldNode(ISourcePosition position, INode argsNode, boolean checkState) {
        super(position);
        this.argsNode = argsNode;
        this.checkState = checkState;
    }

    /**
     * Accept for the visitor pattern.
     * @param iVisitor the visitor
     **/
    public void accept(INodeVisitor iVisitor) {
        ((NodeVisitor)iVisitor).visitYieldNode(this);
    }

    /**
     * Gets the argsNode.
     * @return Returns a Node
     */
    public INode getArgsNode() {
        return argsNode;
    }
    
    public boolean getCheckState() {
        return checkState;
    }
}
