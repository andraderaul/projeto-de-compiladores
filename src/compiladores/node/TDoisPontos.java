/* This file was generated by SableCC (http://www.sablecc.org/). */

package compiladores.node;

import compiladores.analysis.*;

@SuppressWarnings("nls")
public final class TDoisPontos extends Token
{
    public TDoisPontos()
    {
        super.setText(":");
    }

    public TDoisPontos(int line, int pos)
    {
        super.setText(":");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TDoisPontos(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTDoisPontos(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TDoisPontos text.");
    }
}
