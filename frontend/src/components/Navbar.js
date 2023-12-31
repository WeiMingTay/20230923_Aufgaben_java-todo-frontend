import { NavLink } from 'react-router-dom'
import styled from 'styled-components/macro'

export default function Navbar() {
  return (
    <Nav>
      <NavLink exact to="/">
        Home
      </NavLink>
      <NavLink to="/board/todo">Todo</NavLink>
      <NavLink to="/board/doing">Doing</NavLink>
      <NavLink to="/board/done">Done</NavLink>
    </Nav>
  )
}

const Nav = styled.nav`
  display: flex;
  justify-content: space-evenly;

  a {
    padding: .5rem 2rem;
    text-decoration: none;
  color: hotpink;
  }

  a.active{
    background: hotpink;
    color: white;
  }
  a:hover {
    box-shadow: inset 0 0 10px 1px hotpink;
    border-radius: 5rem;
  }
  

 
`
