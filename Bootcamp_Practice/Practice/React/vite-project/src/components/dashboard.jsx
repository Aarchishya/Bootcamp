import React from 'react';
import UserServices from '../services/UserServices';

const Dashboard = () => {

    const users = UserServices.users;
    return (<div className="text-center mt-2">
        <h1>Dashboard</h1>
        <table className="table table-bordered table-hover mt-5"  style={{ width:"500px" }}>
            <thead>
                <tr>
                    <th scope="col">FullName</th>
                    <th scope="col">Email</th>
                    <th scope="col">ContactNo</th>
                    <th scope="col">Role</th>
                </tr>
            </thead>
            <tbody>
            {users.map((user, index) => (
            <tr key={index}>
              <td>{user.fullName}</td>
              <td>{user.email}</td>
              <td>{user.contactNo}</td>
              <td>{user.role}</td>
              <td>{user.isLogin ? 'Yes' : 'No'}</td>
            </tr>
          ))}
                
            </tbody>
        </table>
        <div></div>
    </div>);
}

export default Dashboard;
