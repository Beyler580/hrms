import React from 'react'
import { Dropdown} from 'semantic-ui-react'

export default function SignIn(props) {
    return (
        <div>
         
               
                <Dropdown   pointing = "top Left" text  = "Beyler Qurbanov" style = {{color: "white",marginTop:"0.9em"}} >
                    <Dropdown.Menu >
                        <Dropdown.Item text="Bilgiler" icon="info"/>
                        < Dropdown.Item  text="Cikis yap" icon="sign-out" onClick = {props.signOut}/>

                           
                    </Dropdown.Menu>
                    </Dropdown>
         
            
        </div>
    )
}
