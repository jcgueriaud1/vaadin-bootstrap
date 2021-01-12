import { LitElement, html } from 'lit-element';

class BsCard extends LitElement {
    static get properties() {
        return {
            headerText: { type: String },
            contentText: { type: String },
            footerText: { type: String },
        };
    }

    constructor() {
        super();
        this.headerText = "";
        this.contentText = "";
        this.footerText = "";
    }

    render() {
        return html`<div class="card">
                        <slot name="header"><div class="card-header">${this.headerText}</div></slot>
<div class="card-body"><h5 hidden="true"></h5><p class="card-text">${this.contentText}</p></div>
    <slot name="footer">
        ${this.footerText ? html`<div class="card-footer">${this.footerText}</div>` : html``}
    </slot>
</div>`;
    }

    createRenderRoot() { return this; }
}

customElements.define('bs-card', BsCard);