/* This file was generated by SableCC (http://www.sablecc.org/). */

package compiladores.node;

import compiladores.analysis.*;

@SuppressWarnings("nls")
public final class AComandoEscrevaComandos extends PComandos
{
    private TEscreva _escreva_;
    private TAParentese _aParentese_;
    private PExpList _expList_;
    private PExpOuElogica _expOuElogica_;
    private TFParentese _fParentese_;
    private TPontoEVirg _pontoEVirg_;

    public AComandoEscrevaComandos()
    {
        // Constructor
    }

    public AComandoEscrevaComandos(
        @SuppressWarnings("hiding") TEscreva _escreva_,
        @SuppressWarnings("hiding") TAParentese _aParentese_,
        @SuppressWarnings("hiding") PExpList _expList_,
        @SuppressWarnings("hiding") PExpOuElogica _expOuElogica_,
        @SuppressWarnings("hiding") TFParentese _fParentese_,
        @SuppressWarnings("hiding") TPontoEVirg _pontoEVirg_)
    {
        // Constructor
        setEscreva(_escreva_);

        setAParentese(_aParentese_);

        setExpList(_expList_);

        setExpOuElogica(_expOuElogica_);

        setFParentese(_fParentese_);

        setPontoEVirg(_pontoEVirg_);

    }

    @Override
    public Object clone()
    {
        return new AComandoEscrevaComandos(
            cloneNode(this._escreva_),
            cloneNode(this._aParentese_),
            cloneNode(this._expList_),
            cloneNode(this._expOuElogica_),
            cloneNode(this._fParentese_),
            cloneNode(this._pontoEVirg_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAComandoEscrevaComandos(this);
    }

    public TEscreva getEscreva()
    {
        return this._escreva_;
    }

    public void setEscreva(TEscreva node)
    {
        if(this._escreva_ != null)
        {
            this._escreva_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._escreva_ = node;
    }

    public TAParentese getAParentese()
    {
        return this._aParentese_;
    }

    public void setAParentese(TAParentese node)
    {
        if(this._aParentese_ != null)
        {
            this._aParentese_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._aParentese_ = node;
    }

    public PExpList getExpList()
    {
        return this._expList_;
    }

    public void setExpList(PExpList node)
    {
        if(this._expList_ != null)
        {
            this._expList_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expList_ = node;
    }

    public PExpOuElogica getExpOuElogica()
    {
        return this._expOuElogica_;
    }

    public void setExpOuElogica(PExpOuElogica node)
    {
        if(this._expOuElogica_ != null)
        {
            this._expOuElogica_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expOuElogica_ = node;
    }

    public TFParentese getFParentese()
    {
        return this._fParentese_;
    }

    public void setFParentese(TFParentese node)
    {
        if(this._fParentese_ != null)
        {
            this._fParentese_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._fParentese_ = node;
    }

    public TPontoEVirg getPontoEVirg()
    {
        return this._pontoEVirg_;
    }

    public void setPontoEVirg(TPontoEVirg node)
    {
        if(this._pontoEVirg_ != null)
        {
            this._pontoEVirg_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._pontoEVirg_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._escreva_)
            + toString(this._aParentese_)
            + toString(this._expList_)
            + toString(this._expOuElogica_)
            + toString(this._fParentese_)
            + toString(this._pontoEVirg_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._escreva_ == child)
        {
            this._escreva_ = null;
            return;
        }

        if(this._aParentese_ == child)
        {
            this._aParentese_ = null;
            return;
        }

        if(this._expList_ == child)
        {
            this._expList_ = null;
            return;
        }

        if(this._expOuElogica_ == child)
        {
            this._expOuElogica_ = null;
            return;
        }

        if(this._fParentese_ == child)
        {
            this._fParentese_ = null;
            return;
        }

        if(this._pontoEVirg_ == child)
        {
            this._pontoEVirg_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._escreva_ == oldChild)
        {
            setEscreva((TEscreva) newChild);
            return;
        }

        if(this._aParentese_ == oldChild)
        {
            setAParentese((TAParentese) newChild);
            return;
        }

        if(this._expList_ == oldChild)
        {
            setExpList((PExpList) newChild);
            return;
        }

        if(this._expOuElogica_ == oldChild)
        {
            setExpOuElogica((PExpOuElogica) newChild);
            return;
        }

        if(this._fParentese_ == oldChild)
        {
            setFParentese((TFParentese) newChild);
            return;
        }

        if(this._pontoEVirg_ == oldChild)
        {
            setPontoEVirg((TPontoEVirg) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}