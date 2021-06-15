import React, { useState, useEffect } from 'react'
import { Header, Icon, Table, TableCell, TableRow } from 'semantic-ui-react'
import positonService from '../Services/positonService'

export default function PositionList() {
  const [positions, setPosition] = useState([])
  useEffect(() => {
    let positonservice = new positonService();
    positonservice.getPositions().then(result => setPosition(result.data.data))
  }, [])
  return (
    <div>
      <Header as="h2">
        <Icon name="unordered list" />
        <Header.Content>Postion List</Header.Content>
      </Header>
      <Table celled inverted selectable>
        <Table.Header>
          <Table.Row>
            <Table.HeaderCell>Position ID</Table.HeaderCell>
            <Table.HeaderCell>Position Name</Table.HeaderCell>
          </Table.Row>
        </Table.Header>

        <Table.Body>
        {positions.map(position => (
            <TableRow key={position.id}>
              <TableCell>{position.id}</TableCell>
              <TableCell>{position.position_name}</TableCell>
            </TableRow>

          ))
          }
        </Table.Body>
      </Table>
    </div>
  )
}
