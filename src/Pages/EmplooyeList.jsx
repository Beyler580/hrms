import { useEffect, useState } from 'react'
import { Header, Icon, Table, TableCell, TableRow } from 'semantic-ui-react'
import EmplooyeService from '../Services/emplooyeService'
export default function EmplooyeList() {
  const [emplooyes, setEmplooye] = useState([])
  useEffect(() => {
    let emplooyeService = new EmplooyeService();
    emplooyeService.getEmplooyes().then(result => setEmplooye(result.data.data))

  }, [])


  return (
    <div>
      <Header as="h2">
        <Icon name="unordered list" />
        <Header.Content>Emplooye List</Header.Content>
      </Header>
      <Table celled inverted selectable>
        <Table.Header>
          <Table.Row>
            <Table.HeaderCell>First Name</Table.HeaderCell>
            <Table.HeaderCell>LastName</Table.HeaderCell>
            <Table.HeaderCell>Birth Date</Table.HeaderCell>
            <Table.HeaderCell>Nationality ID</Table.HeaderCell>
            <Table.HeaderCell>Image Url</Table.HeaderCell>

          </Table.Row>
        </Table.Header>

        <Table.Body>
          {emplooyes.map(emplooye => (
            <TableRow key={emplooye.user_Id}>
              <TableCell>{emplooye.first_name}</TableCell>
              <TableCell>{emplooye.last_name}</TableCell>
              <TableCell>{emplooye.birth_of_year}</TableCell>
              <TableCell>{emplooye.nationality_id}</TableCell>
              <TableCell>{emplooye.images.imageUrl}</TableCell>



            </TableRow>

          ))
          }

        </Table.Body>
      </Table>

    </div>
  )
}
