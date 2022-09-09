/* Terei que importar a imagem colocando o caminho e dou uma apelido exemplo icon e coloco entre {}*/
import logo from '../../assets/img/logo.svg';

import './styles.css';

function Header() {// cabeçalho
    return (
        <header>
            <div className="dsmeta-logo-container">
                <img src={logo} alt="DSMeta" />
                <h1>DSMeta</h1>
                <p>
                    Desenvolvido por
                    <a href="https://www.instagram.com/devsuperior.ig">@devsuperior.ig</a>
                </p>
            </div>
        </header>
    )
}

export default Header;