package com.example.finalproject.Nhansu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.finalproject.R;

import java.util.ArrayList;

public class EmployeeAdapter extends RecyclerView.Adapter<EmployeeAdapter.EmployeeViewHolder> {
    private Context context;
    private ArrayList<Employee> employees;

    public EmployeeAdapter(Context context, int item_nhansu, ArrayList<Employee> employees)
    {
        this.context=context;
        this.employees = employees;
    }

    class EmployeeViewHolder extends RecyclerView.ViewHolder{
        private TextView name;
        private TextView department;
        private TextView email;
        private TextView phone;

        public EmployeeViewHolder(@NonNull View view) {
            super(view);
            name = (TextView) view.findViewById(R.id.tvHoten);
            department = (TextView) view.findViewById(R.id.tvChucvu);
            email = (TextView) view.findViewById(R.id.tvEmailnv);
            phone = (TextView) view.findViewById(R.id.tvSdt);
        }
    }

    @NonNull
    @Override
    public EmployeeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int type)
    {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.item_nhansu,parent,false);
        return new EmployeeViewHolder(view);
    }

    public void onBindViewHolder(@NonNull EmployeeViewHolder holder, int position)
    {
        Employee employee = employees.get(position);
        holder.name.setText(employee.getName());
        holder.department.setText(employee.getDepartment());
        holder.email.setText(employee.getEmail());
        holder.phone.setText(employee.getPhone());
    }

    @Override
    public int getItemCount()
    {
        return employees.size();
    }

}
