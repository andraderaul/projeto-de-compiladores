/* This file was generated by SableCC (http://www.sablecc.org/). */

package compiladores.node;

import compiladores.analysis.*;

@SuppressWarnings("nls")
public final class AExpLogicaNaoExpLogica extends PExpLogica
{
    private TNao _nao_;
    private PExpLogicaTermo _expLogicaTermo_;

    public AExpLogicaNaoExpLogica()
    {
        // Constructor
    }

    public AExpLogicaNaoExpLogica(
        @SuppressWarnings("hiding") TNao _nao_,
        @SuppressWarnings("hiding") PExpLogicaTermo _expLogicaTermo_)
    {
        // Constructor
        setNao(_nao_);

        setExpLogicaTermo(_expLogicaTermo_);

    }

    @Override
    public Object clone()
    {
        return new AExpLogicaNaoExpLogica(
            cloneNode(this._nao_),
            cloneNode(this._expLogicaTermo_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAExpLogicaNaoExpLogica(this);
    }

    public TNao getNao()
    {
        return this._nao_;
    }

    public void setNao(TNao node)
    {
        if(this._nao_ != null)
        {
            this._nao_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._nao_ = node;
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
            + toString(this._nao_)
            + toString(this._expLogicaTermo_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._nao_ == child)
        {
            this._nao_ = null;
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
        if(this._nao_ == oldChild)
        {
            setNao((TNao) newChild);
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