/* This file was generated by SableCC (http://www.sablecc.org/). */

package compiladores.node;

import compiladores.analysis.*;

@SuppressWarnings("nls")
public final class TComentarioBlocoFim extends Token
{
    public TComentarioBlocoFim()
    {
        super.setText("*/");
    }

    public TComentarioBlocoFim(int line, int pos)
    {
        super.setText("*/");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TComentarioBlocoFim(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTComentarioBlocoFim(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TComentarioBlocoFim text.");
    }
}
