/* This file was generated by SableCC (http://www.sablecc.org/). */

package compiladores.node;

import compiladores.analysis.*;

@SuppressWarnings("nls")
public final class TAColchete extends Token
{
    public TAColchete()
    {
        super.setText("[");
    }

    public TAColchete(int line, int pos)
    {
        super.setText("[");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TAColchete(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTAColchete(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TAColchete text.");
    }
}