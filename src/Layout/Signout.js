import React from 'react'
import { Button, Menu } from 'semantic-ui-react'

export default function Signout(props) {
    return (
        <div>
            <Menu.Item>
                <Button primary>Kayit Ol</Button>
                <Button primary style = {{marginLeft:"0.7em"}} onClick = {props.signIn}>Giris Yap</Button>

             
            </Menu.Item>
        </div>
    )
}

