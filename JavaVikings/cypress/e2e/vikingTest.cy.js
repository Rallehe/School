// https://docs.cypress.io/api/introduction/api.html

describe('path test', () => {
  it('visits fight via generate  fight-button', () => {
    cy.visit('/')
    
    cy.get('.menu > div:nth-child(2) > a > button').click()
    cy.location('pathname').should('eq', '/fight')
    
    })

    it('Checks if player is saved and that the saved character has picture url:s', () => {
       
      cy.visit('/gear')

      cy.get('#gear[src^="http"]', {timeout: 15000}).should('have.length', 6)

      cy.get('#name').type('Jocke')
      
      cy.get('#save > button').click()
      
      cy.get('.menu> div:nth-child(2) > a > button').click()
      
      cy.get('button').contains('Fighter 1').click()

      cy.get('li').contains('Jocke').click()

      cy.get('.smallPictures > img').should('have.length', 6)

      cy.get('.smallPictures > img').each((item) => {
        
        cy.wrap(item).should('have.attr', 'src').should('not.eq', '').and('includes','http')

      })

    })
       
  })
  
