/* This file was generated by SableCC (http://www.sablecc.org/). */

package compiladores.node;

import compiladores.analysis.*;

@SuppressWarnings("nls")
public final class AComandoRepitaComandos extends PComandos
{
    private TRepita _repita_;
    private PComandoList _comandoList_;
    private PComandos _comandos_;
    private TAte _ate_;
    private TAParentese _aParentese_;
    private PExpLogica _expLogica_;
    private TFParentese _fParentese_;
    private TPontoEVirg _pontoEVirg_;

    public AComandoRepitaComandos()
    {
        // Constructor
    }

    public AComandoRepitaComandos(
        @SuppressWarnings("hiding") TRepita _repita_,
        @SuppressWarnings("hiding") PComandoList _comandoList_,
        @SuppressWarnings("hiding") PComandos _comandos_,
        @SuppressWarnings("hiding") TAte _ate_,
        @SuppressWarnings("hiding") TAParentese _aParentese_,
        @SuppressWarnings("hiding") PExpLogica _expLogica_,
        @SuppressWarnings("hiding") TFParentese _fParentese_,
        @SuppressWarnings("hiding") TPontoEVirg _pontoEVirg_)
    {
        // Constructor
        setRepita(_repita_);

        setComandoList(_comandoList_);

        setComandos(_comandos_);

        setAte(_ate_);

        setAParentese(_aParentese_);

        setExpLogica(_expLogica_);

        setFParentese(_fParentese_);

        setPontoEVirg(_pontoEVirg_);

    }

    @Override
    public Object clone()
    {
        return new AComandoRepitaComandos(
            cloneNode(this._repita_),
            cloneNode(this._comandoList_),
            cloneNode(this._comandos_),
            cloneNode(this._ate_),
            cloneNode(this._aParentese_),
            cloneNode(this._expLogica_),
            cloneNode(this._fParentese_),
            cloneNode(this._pontoEVirg_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAComandoRepitaComandos(this);
    }

    public TRepita getRepita()
    {
        return this._repita_;
    }

    public void setRepita(TRepita node)
    {
        if(this._repita_ != null)
        {
            this._repita_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._repita_ = node;
    }

    public PComandoList getComandoList()
    {
        return this._comandoList_;
    }

    public void setComandoList(PComandoList node)
    {
        if(this._comandoList_ != null)
        {
            this._comandoList_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._comandoList_ = node;
    }

    public PComandos getComandos()
    {
        return this._comandos_;
    }

    public void setComandos(PComandos node)
    {
        if(this._comandos_ != null)
        {
            this._comandos_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._comandos_ = node;
    }

    public TAte getAte()
    {
        return this._ate_;
    }

    public void setAte(TAte node)
    {
        if(this._ate_ != null)
        {
            this._ate_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._ate_ = node;
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
            + toString(this._repita_)
            + toString(this._comandoList_)
            + toString(this._comandos_)
            + toString(this._ate_)
            + toString(this._aParentese_)
            + toString(this._expLogica_)
            + toString(this._fParentese_)
            + toString(this._pontoEVirg_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._repita_ == child)
        {
            this._repita_ = null;
            return;
        }

        if(this._comandoList_ == child)
        {
            this._comandoList_ = null;
            return;
        }

        if(this._comandos_ == child)
        {
            this._comandos_ = null;
            return;
        }

        if(this._ate_ == child)
        {
            this._ate_ = null;
            return;
        }

        if(this._aParentese_ == child)
        {
            this._aParentese_ = null;
            return;
        }

        if(this._expLogica_ == child)
        {
            this._expLogica_ = null;
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
        if(this._repita_ == oldChild)
        {
            setRepita((TRepita) newChild);
            return;
        }

        if(this._comandoList_ == oldChild)
        {
            setComandoList((PComandoList) newChild);
            return;
        }

        if(this._comandos_ == oldChild)
        {
            setComandos((PComandos) newChild);
            return;
        }

        if(this._ate_ == oldChild)
        {
            setAte((TAte) newChild);
            return;
        }

        if(this._aParentese_ == oldChild)
        {
            setAParentese((TAParentese) newChild);
            return;
        }

        if(this._expLogica_ == oldChild)
        {
            setExpLogica((PExpLogica) newChild);
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