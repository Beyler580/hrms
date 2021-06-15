import React from 'react'
import { Header, Icon, Table } from 'semantic-ui-react'


export default function CurriculliumvitaeList() {
    return (
        <div>
              <Header as="h2">
          <Icon name="unordered list" />
          <Header.Content>CurriculiumVitae List</Header.Content>
          </Header>
              <Table celled inverted selectable>
    <Table.Header>
      <Table.Row>
        <Table.HeaderCell>CurriculiumVitae ID</Table.HeaderCell>
        <Table.HeaderCell>First Name</Table.HeaderCell>
        <Table.HeaderCell>LastName</Table.HeaderCell>
        <Table.HeaderCell>Image Url</Table.HeaderCell>
        <Table.HeaderCell>School Name</Table.HeaderCell>
        <Table.HeaderCell>Department</Table.HeaderCell>
        <Table.HeaderCell>Position</Table.HeaderCell>
        <Table.HeaderCell>WorkPlace</Table.HeaderCell>
        <Table.HeaderCell>Start Date</Table.HeaderCell>
        <Table.HeaderCell>Finish Date</Table.HeaderCell>
        <Table.HeaderCell>Language</Table.HeaderCell>
        <Table.HeaderCell>Language Level</Table.HeaderCell>
        <Table.HeaderCell>Coverletter</Table.HeaderCell>
        <Table.HeaderCell>Technologies</Table.HeaderCell>
        <Table.HeaderCell>GitHub</Table.HeaderCell>
        <Table.HeaderCell>LinkedIn</Table.HeaderCell>
      </Table.Row>
    </Table.Header>

    <Table.Body>
      <Table.Row>
        <Table.Cell>John</Table.Cell>
        <Table.Cell>Approved</Table.Cell>
        <Table.Cell textAlign='right'>None</Table.Cell>
      </Table.Row>
      <Table.Row>
        <Table.Cell>Jamie</Table.Cell>
        <Table.Cell>Approved</Table.Cell>
        <Table.Cell textAlign='right'>Requires call</Table.Cell>
      </Table.Row>
      <Table.Row>
        <Table.Cell>Jill</Table.Cell>
        <Table.Cell>Denied</Table.Cell>
        <Table.Cell textAlign='right'>None</Table.Cell>
      </Table.Row>
    </Table.Body>
  </Table>
        </div>
    )
}
