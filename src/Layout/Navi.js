import React, { useState} from "react";
import { Container,  Menu } from 'semantic-ui-react'
import SignIn from '../Layout/Signin'
import Signout from '../Layout/Signout'
export default function Navi() {
    function handleSignOuT(params) {
        setisAuthenticated(false)

    }
    function handleSignIn(){
        setisAuthenticated(true)

    }
    const [isAuthenticated, setisAuthenticated] = useState(true)

    return (
        <div>
            
            <Menu inverted fixed="top"  >
                              

                <Container>
                <Menu.Item
                name = "HRMS"
                style = {{color:"green"}} 
                 
                />
                <Menu.Item
                    name='messages'
                
                />

                <Menu.Menu position='right'>
                    {isAuthenticated?<SignIn signOut = {handleSignOuT}/>:<Signout signIn = {handleSignIn}/>}
               
                 
        
                </Menu.Menu>

                </Container>
        
            </Menu>
            
        </div>
    )
}
