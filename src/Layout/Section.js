import React from 'react'
import { Grid, GridColumn, GridRow } from 'semantic-ui-react'

import EmplooyerList from '../Pages/EmplooyerList'
import EmplooyeList from '../Pages/EmplooyeList'
import PositionList from '../Pages/PositionList'
import JobAdvertList from '../Pages/JobAdverList'


export default function Section() {
    return (
        <div>
            <Grid >
                <GridRow>
                    <GridColumn width = {12}>
                        <EmplooyerList/>
                    </GridColumn>
                </GridRow>
                <GridRow>
                    <GridColumn width = {12}>
                        <EmplooyeList/>
                    </GridColumn>
                </GridRow>
                <GridRow>
                    <GridColumn width = {12}>
                        <PositionList/>
                    </GridColumn>
                </GridRow>
                <GridRow>
                    <GridColumn width = {12}>
                        <JobAdvertList/>
                    </GridColumn>
                </GridRow>
            
            </Grid>
            
        </div>
    )
}
