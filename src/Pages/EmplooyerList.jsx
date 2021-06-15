import React, { useEffect, useState } from 'react'
import { Header, Icon, Table,TableCell } from 'semantic-ui-react'
import emplooyerService from '../Services/emplooyerService';
export default function EmplooyerList() {
  const [emplooyers, setemplooyers] = useState([])
  useEffect(() => {
    let emplooyerservice = new emplooyerService();
    emplooyerservice.getEmplooyers().then(result => setemplooyers(result.data.data))
  }, [])
    return (
        <div>
        <Header as="h2">
          <Icon name="unordered list" />
          <Header.Content>Employer List</Header.Content>
          </Header>
              <Table celled inverted selectable>
    <Table.Header>
      <Table.Row>
        <Table.HeaderCell>Company</Table.HeaderCell>
        <Table.HeaderCell>WebPage</Table.HeaderCell>
        <Table.HeaderCell>Phone Number</Table.HeaderCell>
        
      </Table.Row>
    </Table.Header>

    <Table.Body>
       
      
      {emplooyers.map(emplooyer => (
        <Table.Row key = {emplooyer.user_id}>
          <TableCell>{emplooyer.company_name}</TableCell>
          <TableCell>{emplooyer.webpage_name}</TableCell>
          <TableCell>{emplooyer.phone_number}</TableCell>
        </Table.Row>

      ))}
      

      
 
    </Table.Body>
  </Table>
        </div>
    )
}
