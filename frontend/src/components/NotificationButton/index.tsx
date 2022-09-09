/* Terei que importar a imagem colocando o caminho e dou uma apelido exemplo icon e coloco entre {}*/
import icon from '../../assets/img/notification-icon.svg'

import './styles.css'

function NotificationButton() {
    return (
        <div className="dsmeta-red-btn">
            <img src={icon} alt="Notificar" />
        </div>
    )
}

export default NotificationButton