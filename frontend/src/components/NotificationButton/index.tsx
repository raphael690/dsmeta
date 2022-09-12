/* Terei que importar a imagem colocando o caminho e dou uma apelido exemplo icon e coloco entre {}*/
import axios from 'axios';
import { toast } from 'react-toastify';
import icon from '../../assets/img/notification-icon.svg';
import { BASE_URL } from '../../utils/request';

import './styles.css';

type Prosp = {
    saleId: number;
}

function handleClick(Id :number){
    axios(`${BASE_URL}/sales/${Id}/notification`)
    .then(Response => {
      toast.info("SMS enviado com sucesso");
    });
}

function NotificationButton({saleId} : Prosp) {
    return (
        <div className="dsmeta-red-btn" onClick={() => handleClick(saleId)}>
            <img src={icon} alt="Notificar" />
        </div>
    )
}

export default NotificationButton;