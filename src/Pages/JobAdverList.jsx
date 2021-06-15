import React, { useEffect, useState } from 'react'
import { Header, Icon, Table,TableCell } from 'semantic-ui-react'
import jobadvertService from '../Services/jobadvertService'

export default function JobAdvertList() {
  const [jobadverts, setjobadverts] = useState([])
  useEffect(() => {
    let jobadvertservice = new jobadvertService()
    jobadvertservice.getJobadverts().then(result => setjobadverts(result.data.data))
    
  }, [])
    return (
        <div>
              <Header as="h2">
          <Icon name="unordered list" />
          <Header.Content>JobAdversiment List</Header.Content>
          </Header>
              <Table celled inverted selectable>
    <Table.Header>
      <Table.Row>

        <Table.HeaderCell>Job Title</Table.HeaderCell>
        <Table.HeaderCell>Open positions</Table.HeaderCell>
        <Table.HeaderCell>Minimum Salary</Table.HeaderCell>
        <Table.HeaderCell>Maximium Salary</Table.HeaderCell>
        <Table.HeaderCell>Created Date</Table.HeaderCell>
        <Table.HeaderCell>Expression Date</Table.HeaderCell>
        <Table.HeaderCell>Company</Table.HeaderCell>
        <Table.HeaderCell>City</Table.HeaderCell>
      </Table.Row>
    </Table.Header>

    <Table.Body>
      {jobadverts.map(jobadvert => (
        <Table.Row key = {jobadvert.adv_id}>
          <TableCell>{jobadvert.positions.position_name}</TableCell>
          <TableCell>{jobadvert.openposition_count}</TableCell>
          <TableCell>{jobadvert.min_salary}</TableCell>
          <TableCell>{jobadvert.max_salary}</TableCell>
          <TableCell>{jobadvert.created_Date}</TableCell>
          <TableCell>{jobadvert.expression_date}</TableCell>
          <TableCell>{jobadvert.emplooyers.company_name}</TableCell>
          <TableCell>{jobadvert.city.city_name}</TableCell>


        </Table.Row>

      ))}
      
    </Table.Body>
  </Table>
            
        </div>
    )
}
