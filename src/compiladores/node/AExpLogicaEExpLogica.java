/* This file was generated by SableCC (http://www.sablecc.org/). */

package compiladores.node;

import compiladores.analysis.*;

@SuppressWarnings("nls")
public final class AExpLogicaEExpLogica extends PExpLogica
{
    private PExpLogica _expLogica_;
    private TE _e_;
    private PExpLogicaTermo _expLogicaTermo_;

    public AExpLogicaEExpLogica()
    {
        // Constructor
    }

    public AExpLogicaEExpLogica(
        @SuppressWarnings("hiding") PExpLogica _expLogica_,
        @SuppressWarnings("hiding") TE _e_,
        @SuppressWarnings("hiding") PExpLogicaTermo _expLogicaTermo_)
    {
        // Constructor
        setExpLogica(_expLogica_);

        setE(_e_);

        setExpLogicaTermo(_expLogicaTermo_);

    }

    @Override
    public Object clone()
    {
        return new AExpLogicaEExpLogica(
            cloneNode(this._expLogica_),
            cloneNode(this._e_),
            cloneNode(this._expLogicaTermo_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAExpLogicaEExpLogica(this);
    }

    public PExpLogica getExpLogica()
    {
        return this._expLogica_;
    }

    public void setExpLogica(PExpLogica node)
    {
        if(this._expLogica_ != null)
        {
            this._expLogica_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expLogica_ = node;
    }

    public TE getE()
    {
        return this._e_;
    }

    public void setE(TE node)
    {
        if(this._e_ != null)
        {
            this._e_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._e_ = node;
    }

    public PExpLogicaTermo getExpLogicaTermo()
    {
        return this._expLogicaTermo_;
    }

    public void setExpLogicaTermo(PExpLogicaTermo node)
    {
        if(this._expLogicaTermo_ != null)
        {
            this._expLogicaTermo_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expLogicaTermo_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._expLogica_)
            + toString(this._e_)
            + toString(this._expLogicaTermo_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._expLogica_ == child)
        {
            this._expLogica_ = null;
            return;
        }

        if(this._e_ == child)
        {
            this._e_ = null;
            return;
        }

        if(this._expLogicaTermo_ == child)
        {
            this._expLogicaTermo_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._expLogica_ == oldChild)
        {
            setExpLogica((PExpLogica) newChild);
            return;
        }

        if(this._e_ == oldChild)
        {
            setE((TE) newChild);
            return;
        }

        if(this._expLogicaTermo_ == oldChild)
        {
            setExpLogicaTermo((PExpLogicaTermo) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}